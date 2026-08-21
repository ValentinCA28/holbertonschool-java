public class Manager extends Employee {
    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return getFixedSalary() * 0.20
                    + (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01;
        }
        return 0;
    }
}
