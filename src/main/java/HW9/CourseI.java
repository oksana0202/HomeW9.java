package HW9;

    public class CourseI implements Course {
        private String name;

        public CourseI(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

