package model;

/**
 * Created by anonymous on 10.04.2017.
 */
public class Student{
        private String surName;  //фамилия
        private String firstName;//имя
        private String lastName; //отчесвто
        private Address address;


        public Student()
        {

        }
        public Student(String surName,String firstName,String lastName,
                String country, String region, String city, String street, int house, int housing, int apartment)
        {
            this.surName=surName;
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=new Address(country, region, city, street, house, housing,apartment);
        }
        public void setSurName(String surName)
        {
            this.surName=surName;
        }
        public void setFirstName(String firstName)
        {
            this.firstName=firstName;
        }
        public void setLastName(String lastName)
        {
            this.lastName=lastName;
        }
        public void setAddress(Address address)
        {
            this.address=address;
        }

        public String getSurName()
        {
            return surName;
        }
        public String getFirstName()
        {
            return firstName;
        }
        public String getLastName()
        {
            return lastName;
        }
        public Address getAddress()
        {
            return address;
        }


        public Object getValue(int index)
        {
            switch (index)
            {
                case 0: return surName;
                case 1: return firstName;
                case 2: return lastName;
                case 3: return address;
            }
            return null;
        }
}
