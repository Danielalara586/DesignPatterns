package Builder;

public class User {
    private String name, lastName, email,
            phone, address, paymentMethod, token;
    private boolean contactMedia;

    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.email = "";
        this.phone = "";
        this.address = "";
        this.paymentMethod = "";
        this.token = "";
        this.contactMedia = false;
    }

    public static User Make(String name, String lastName) {
        return new User(name, lastName);
    }

    public BuilderUser setContactMedia(boolean contactMedia) {
        if (!contactMedia) {
            throw new IllegalArgumentException("You can't assign a false value to media contact");
        }

        this.contactMedia = contactMedia;
        return new BuilderUser(this);
    }



    @Override
    public String toString() {
        return name + " " + lastName + " " +
                email + " " + phone + " " +
                address + " " + paymentMethod + " " + token;
    }

    public static class BuilderUser {
        private User user;

        public BuilderUser(User user) {
            this.user = user;
        }

        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public BuilderUser setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public BuilderUser setAddress(String address) {
            user.address = address;
            return this;
        }

        public BuilderUser setPaymentMethod(String paymentMethod) {
            if (user.email.isBlank() || user.phone.isBlank() || user.address.isBlank()) {
                throw new IllegalArgumentException("All contact parameters should be filled up");
            }

            user.paymentMethod = paymentMethod;
            return this;
        }

        public BuilderUser setToken(String token) {
            if(user.paymentMethod.isBlank()) {
                throw new IllegalArgumentException("Payment method should be specified");
            }
            else {
                user.token = token;
                return this;
            }
        }


        public User Build() {
            return user;
        }

    }
}
