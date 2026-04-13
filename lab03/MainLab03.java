public class MainLab03 {
    public static void main(String[] args) {

        // --- UserStory без зависимостей ---
        UserStory us1 = new UserStory(1, "Форма реєстрації", 5);
        UserStory us2 = new UserStory(2, "Об'єкт реєстрації користувача", 3);

        System.out.println("=== UserStory ===");
        System.out.println(us1);
        System.out.println(us2);

        // --- UserStory с зависимостью от us1 ---
        UserStory us3 = new UserStory(3, "Підтвердження email", 4, us1);
        System.out.println(us3);

        // --- Попытка завершить us3 до завершения зависимости ---
        us3.complete();
        System.out.println("\nСпроба завершити us3 (залежність us1 не завершена): " + us3.isCompleted()); // false

        // --- Завершаем us1, затем us3 ---
        us1.complete();
        us3.complete();
        System.out.println("Після завершення us1, завершити us3: " + us3.isCompleted()); // true

        // --- Bug: createBug с незавершённой UserStory ---
        Bug bugFail = Bug.createBug(10, "Тест null-бага", 2, us2);
        System.out.println("\n=== Bug ===");
        System.out.println("Bug з незавершеною UserStory: " + bugFail); // null

        // --- Завершаем us2, создаём Bug ---
        us2.complete();
        Bug bug1 = Bug.createBug(2, "Додати повторюваний пароль", 2, us2);
        System.out.println("Bug після завершення us2: " + bug1);

        // --- createBug с null ---
        Bug bugNull = Bug.createBug(99, "Тест", 1, null);
        System.out.println("Bug з null UserStory: " + bugNull); // null

        // --- Sprint ---
        System.out.println("\n=== Sprint ===");
        Sprint sprint = new Sprint(20, 5);

        UserStory us4 = new UserStory(4, "Вхід у систему", 6);
        UserStory us5 = new UserStory(5, "Профіль користувача", 7);
        UserStory us6 = new UserStory(6, "Налаштування", 8);

        System.out.println("Додати us4 (estimate=6): " + sprint.addUserStory(us4));   // true
        System.out.println("Додати us5 (estimate=7): " + sprint.addUserStory(us5));   // true
        System.out.println("Додати us6 (estimate=8, перевищить ліміт часу): " + sprint.addUserStory(us6)); // false
        System.out.println("Додати bug1 (estimate=2): " + sprint.addBug(bug1));        // false (bug1 completed)
        System.out.println("Додати null: " + sprint.addUserStory(null));               // false

        System.out.println("\nЗагальна оцінка спринту: " + sprint.getTotalEstimate());

        System.out.println("\nТікети у спринті:");
        for (Ticket t : sprint.getTickets()) {
            System.out.println("  " + t + " | estimate=" + t.getEstimate() + " | completed=" + t.isCompleted());
        }
    }
}
