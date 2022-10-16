public class Man {

    private int man;

    public int dnaCode;

    public int getDnaCode() {
        return dnaCode;
    }

    public Man(int man, int dnaCode) {
        this.man = man;
        this.dnaCode = dnaCode;
    }

    public Man(int man) {
        this.man = man;
    }

    public int getMan() {
        return man;
    }

    public void setMan(int man) {
        this.man = man;
    }

    // Object obj = man1
    @Override // Мы переопределили equals и заставили сравнивать не по ссылкам,
    // а по ДНК
    public boolean equals(Object obj) {
        // Проверим, ссылается ли переменная ссылочного типа obj
        // на объект класса Man
        if (obj instanceof Man) {
            // Является объектом класса Man
            Man tempMan = (Man) obj;
            return  dnaCode == tempMan.getDnaCode();
        } else  {
            // Не является объектом класса Man
            return  false;
        }
//        return this.dnaCode == obj.dna;
    }

    @Override
    public String toString() {
        return "Man{" +
                "man=" + man +
                '}';
    }
}
