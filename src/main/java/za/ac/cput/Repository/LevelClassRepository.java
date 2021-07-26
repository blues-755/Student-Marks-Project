
/*
  LevelClass.java
  author:  marco Mulondayi 219049505
  date 10/06/2021
 */


package za.ac.cput.Repository;

import za.ac.cput.Entity.LevelClass;
import za.ac.cput.Factory.LevelClassFactory;

import java.util.HashSet;
import java.util.Set;

public class LevelClassRepository {


    private Set<LevelClass> levelClassDB;

    public LevelClassRepository () {
        this.levelClassDB = new HashSet<>();
    }

    public LevelClass create(String levelName,String grade) {
        LevelClass levelClass = LevelClassFactory.build(levelName,grade);
        this.levelClassDB.add(levelClass);
        return levelClass;
    }

    public LevelClass read(String levelId) {
        LevelClass levelClass = null;
        for (LevelClass g : levelClassDB) {
            if (g.getId().equalsIgnoreCase(levelId)) {
                levelClass= g;
                break;
            }
        }
        return levelClass;
    }

    public LevelClass update(LevelClass level) {
        LevelClass oldLevelClass = read(level.getId());
        if (oldLevelClass != null) {
            levelClassDB.remove(oldLevelClass);
            levelClassDB.add(level);
        }
        return level;
    }

    public LevelClass delete(String levelId) {
        LevelClass levelClass = read(levelId);
        if (levelId != null) {
            this.levelClassDB.remove((levelClass));
        }
        return null;
    }
}