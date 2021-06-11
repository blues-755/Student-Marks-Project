/* Role.java
 Entity for the SubjectClass
 Author: MMC Tshikuna (218319363)
 Date: 8 June 2021

 */
package za.ac.cput.Entity;

public class Role {

    private String roleId;
    private String  roleName;

    public Role(Builder builder) {
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
        private String roleId;
        private String roleName;

        public Builder setRoleId(String roleId) {
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

