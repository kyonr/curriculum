package polimoSuper;

// サブクラス: ナイト（緑色の装甲の剣振り回してくるやつ！
public class BradeKnight extends AbilityOfEnemy {

 public BradeKnight(String attackName) {
 super.attackName = attackName;
 }

 @Override
 protected void useAbility() {
 System.out.println(super.attackName);
 }
}