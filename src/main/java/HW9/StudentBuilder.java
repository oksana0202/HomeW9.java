package HW9;

import java.util.List;

public class StudentBuilder<courses, quantity> {
    private String name;
    private List<Course> courses;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setCourses(List<Course> courses) {
        this.courses = courses;
        return this;
    }

    public StudentI createStudent() {
        return new StudentI(name, courses) {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public List<Course> getAllCourses() {
                return null;
            }
        };
    }
}