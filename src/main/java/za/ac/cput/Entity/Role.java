/* Role.java
 Entity for the Role
 Author: MMC Tshikuna (218319363)
 Date: 8 June 2021

 */

package za.ac.cput.Entity;

public class Role {
    private int  roleId;
    private String  roleName;

    private Role(Builder builder) {
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;

    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public static class Builder{
        private int roleId;
        private String roleName;

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;

            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;

            return this;
        }
        public Role build(){

            return new Role(this);
        }

        public Builder copy(Role role){
            this.roleId = role.roleId;
            this.roleName = role.roleName;

            return this;
        }

    }

}
