# Section2 : Generic

## 제네릭 타입의 한계와 상한

### <T>만 사용할 때의 문제점
제네릭 클래스를 `class AnimalHospital<T>` 같이 선언을 하면, 컴파일러는 `T` 어떤 값이 들어올지 전혀 알 수 없다.

* `dog`, `cat`, `Integer`, `String`, 어떤 타입이든 들어올 수 있기 때문에, 컴파일러는 안전을 위해 `T`를 모든 객체의 최상위 부모인 `Object`로 가정을 한다.
* `Object`가 제공하는 기능(toString, equals)등만 사용할 수 있고, 특정 클래스의 메서드는 호출할 수 없어 컴파일 에러가 나온다.

```
public class AnimalHospitalV2<T> {
  private T animal;
  
  publlic void set(T animal){
    this.animal = animal;
  }

  public void checkUp(){
    Object의 메서드는 사용이 가능
    animal.toString();
    
    하지만 T가 Animal 클래스를 보장을 못하기 때문에
    sout animal.getName(); 컴파일 에러가 발생한다.
  }
```

# 타입 매개변수 제한 <T extends Animal>
* 타입 매개변수 T에 들어올 수 있는 타입을 특정 클래스와 그 자식으로 제한을 한다.
* Animal 혹은 그 자식 타입만 들어올 수 있게 제한이 된다.

# 제네릭 메서드
* 클래스 전체가 아닌, 메서드 하나에만 제네릭을 적용하는 방법이다.
* 메서드를 선언할 때 반환 타입 앞에 <T>를 적어주면 된다.
* public <T> void add(T t){}
* 메서드 내에서만 한정적으로 사용되는 타입 매개변수이다.
