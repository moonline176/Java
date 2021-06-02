package pkg.inhenritence;

public class A {
	int sa;
}

class B extends A {
}
class C extends A {}

interface X {}
interface Y {}
interface Z extends X {} //인터페이스 간의 상속은 extends를 이용

class D extends B implements Z,Y {
	int sd;
}
class E extends C {}

