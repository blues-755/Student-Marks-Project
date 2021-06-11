package za.ac.cput.Entity;

import static org.junit.jupiter.api.Assertions.*;


/*
 author marco mulonday
 219049505
 */
import za.ac.cput.Entity.LevelClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


    class LevelClassTest {
        private LevelClass  levelclass1;
        private LevelClass  levelclass2;
        private LevelClass  levelclass3;
        @BeforeEach
        void setUp() {
            this.levelclass1 = new LevelClass();
            this.levelclass2 = new LevelClass();
            this.levelclass3= new LevelClass();
            this.levelclass1 = this.levelclass2;
        }
        // testing Identity
        @Test
        public void testIdentity() {
            Assertions.assertSame(this.levelclass1 ,this.levelclass2);;
        }
        // testing equality
        @Test
        public void testEquality() {
            Assertions.assertEquals(this.levelclass1 ,this.levelclass2);
        }
        // test for faill test
        @Test
        public void testFail() {
            Assertions.assertEquals(this.levelclass1 ,this.levelclass2);
            Assertions.fail("this will faill");
        }
        // test for disable test

        @Disabled("Disabled until CustomerService is up!")
        @Test
        void testCustomerServiceGet() {
            Assertions.assertEquals(this.levelclass1 ,this.levelclass2);
        }
    }
