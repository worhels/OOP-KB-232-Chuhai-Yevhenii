import java.util.Arrays;

public class UserStory extends Ticket {
    private final UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory... dependencies) {
        super(id, name, estimate);
        if (dependencies == null) {
            this.dependencies = new UserStory[0];
        } else {
            this.dependencies = Arrays.copyOf(dependencies, dependencies.length);
        }
    }

    @Override
    public void complete() {
        for (UserStory dep : dependencies) {
            if (dep == null || !dep.isCompleted()) {
                return;
            }
        }
        super.complete();
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependencies, dependencies.length);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
