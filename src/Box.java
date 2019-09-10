public class Box<E, A extends Number> {
    private E money;
    private A bank;

    public Box(E money, A bank) {
        this.money = money;
        this.bank = bank;
    }


    public E getMoney() {
        return money;
    }

    public A getBank() {
        return bank;
    }
}
