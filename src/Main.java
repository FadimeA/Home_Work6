//Создайте перечисление WeaponType, в котором перечислите три типа оружия.
//Создайте класс Weapon с приватными полями для хранения типа оружия и названия оружия, а также добавьте методы доступа
//        (геттеры и сеттеры) к этим полям.
//Создайте класс GameEntity для представления игровых сущностей, выделив общие поля, присущие как боссам, так и героям,
//и добавьте методы доступа к этим полям.
//Создайте класс Boss, который наследуется от GameEntity, и добавьте в него поле сложного типа Weapon
//        (для назначения оружия боссу), а также методы доступа к этому полю.
//В классе Main создайте экземпляр босса и установите ему все необходимые свойства.
//Реализуйте метод printInfo() в классе Boss для печати информации о боссе.
//Создайте класс Skeleton, который также наследуется от класса Boss.
//Добавьте в класс Skeleton поле для хранения количества стрел и методы доступа к этому полю.
//Переопределите метод printInfo() в классе Skeleton.
//В методе main создайте и заполните данными два экземпляра Skeleton, а затем выведите всю информацию о скелетах.

public class Main {
    public static void main(String[] args) {
   Boss boss = new Boss(200,100,new Weapon(WeaponType.SWORD,"Minazuki"));
        System.out.println(boss.printInfo());

        Skeleton skeleton1= new Skeleton(300,100,new Weapon(WeaponType.GUN,"Winner"),30);
        Skeleton skeleton2= new Skeleton(40,10,new Weapon(WeaponType.BOW,"K"),50);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());







    }
}