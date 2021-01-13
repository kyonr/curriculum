package polimoSuper;

// サブクラス: プラズマ（電気飛ばしてくる青白い雲みたいなやつ！
public class PlasmaWisp extends AbilityOfEnemy {

 public PlasmaWisp(String attackName) {
 super.attackName = attackName;
 }

 @Override
 protected void useAbility() {
 System.out.println(super.attackName);
 }
}