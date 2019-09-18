package com.efectivejava.inheritance;

public class Test {

    public static void main(String[] args) {
        ders2();
    }

    public static void ders1() {
        System.out.println("Override edilen metot çalışması");
        ChildClass childClass = new ChildClass();

        ParentClass parentClass = new ChildClass();

        ParentClass superClassParent = new ParentClass();

        System.out.println(parentClass.getFrom());
        System.out.println(childClass.getFrom());
        System.out.println(superClassParent.getFrom());

        System.out.println("Override edilen metod çağrıldığında new Hangi classtan yapıldıysa o çağrılır.");
    }

    public static void ders2() {
        System.out.println("Sadece child olan metot nasıl erişilir");
        System.out.println("Nesne Child oluşturulmalıdır. Reference Type child ise direkt erişim olur. Parent ise Cast etmek gerekir.");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.onlyChild());
        System.out.println(((ChildClass)childClassParentReference).onlyChild());
        System.out.println(((ChildClass)parentClassParentReference).onlyChild());
    }

    public static void ders3() {
        System.out.println("Sadece Parent olan metota nasıl erişilir");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.onlyParent());
        System.out.println(childClassParentReference.onlyParent());
        System.out.println(parentClassParentReference.onlyParent());
        System.out.println("Her durumda erişim olur");
    }

    public static void ders4() {
        System.out.println("Sadece Parent olan private field erişim");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.getPrivateOnlyParent());
        System.out.println(childClassParentReference.getPrivateOnlyParent());
        System.out.println(parentClassParentReference.getPrivateOnlyParent());
        childClassChildReference.setPrivateOnlyParent(2);
        childClassParentReference.setPrivateOnlyParent(2);
        parentClassParentReference.setPrivateOnlyParent(2);
        System.out.println(childClassChildReference.getPrivateOnlyParent());
        System.out.println(childClassParentReference.getPrivateOnlyParent());
        System.out.println(parentClassParentReference.getPrivateOnlyParent());
        System.out.println("private alana dışarıdan erişim olmaz. getter metot ise public olduğunda ders 3ten farkı kalmaz. ");
        System.out.println("Her durumda erişim olur");
    }

    public static void ders5() {
        System.out.println("Parent Classta Sadece Protected olan private field erişim");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.protectedOnlyParent);
        System.out.println(childClassParentReference.protectedOnlyParent);
        System.out.println(parentClassParentReference.protectedOnlyParent);

        childClassChildReference.protectedOnlyParent = 8;
        childClassParentReference.protectedOnlyParent = 8;
        parentClassParentReference.protectedOnlyParent = 8;

        System.out.println(childClassChildReference.protectedOnlyParent);
        System.out.println(childClassParentReference.protectedOnlyParent);
        System.out.println(parentClassParentReference.protectedOnlyParent);
        System.out.println("protected alana her durumda erişim olur. Der3 ten farkı kalmaz.");
        System.out.println("Her durumda erişim olur");
    }

    public static void ders6() {
        System.out.println("Parent Classta Sadece Protected olan private field erişim");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.protectedOnlyParent);
        System.out.println(childClassParentReference.protectedOnlyParent);
        System.out.println(parentClassParentReference.protectedOnlyParent);
        System.out.println("protected alana her durumda erişim olur. Der3 ten farkı kalmaz.");
        System.out.println("Her durumda erişim olur");
    }

    public static void ders7() {
        System.out.println("Parent Child de olan public field ");
        System.out.println("Ders 2 ile aynı");
        ChildClass childClassChildReference = new ChildClass();

        ParentClass childClassParentReference = new ChildClass();

        ParentClass parentClassParentReference = new ParentClass();

        System.out.println(childClassChildReference.publicOnlyChild);
        System.out.println(((ChildClass)childClassParentReference).publicOnlyChild);
         System.out.println(((ChildClass)parentClassParentReference).publicOnlyChild);

    }


}
