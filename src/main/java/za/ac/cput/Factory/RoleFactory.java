package za.ac.cput.Factory;

import za.ac.cput.Entity.Role;

public class RoleFactory {

    public static Role build(String roleId, String roleName) {

        try {
            if (roleName.isEmpty()) {
                return null;
            }
        } catch (NullPointerException e) {
            System.out.println("Enter a Role");
        }


        return new Role.Builder()
                .setRoleId(roleId)
                .setRoleName(roleName)
                .build();

    }
}
