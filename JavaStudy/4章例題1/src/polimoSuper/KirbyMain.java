package polimoSuper;

// メイン: 敵を吸い込んで、吸い込んだ敵の能力を使うシーン
public class KirbyMain {

 public static void main(String[] args) {
  // まずはプラズマを吸い込む！
 AbilityOfEnemy aoe = new PlasmaWisp("プラズマはどうだん！！！！");
  // 打つべし！
 aoe.useAbility();
  // 続いてナイトを吸い込む！
 aoe = new BradeKnight("ひゃくれつぎり！！！");
  // 切るべし！
 aoe.useAbility();
 }
}