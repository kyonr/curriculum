package exception;

import java.util.Scanner;

/**
 * 4-1 : 課題内容
 *
 * よく目にする例外処理に関して、課題をこなしていただきます。
 * 問①〜③の指示に従い必要な処理を記述してください。
 *
 * 実行時はScannerを利用して処理の確認を行います。
 * コンソールへ必要なパラメーター入力し、Enterを押下して実装結果を確認していきましょう！
 *
 */
public class ExException {

  // 定数（条件）
 private static final int CONST_EXCEPTION_TRIGER_NULL = 1;
 private static final int CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS = 2;
 private static final int CONST_EXCEPTION_TRIGER_CAST = 3;

  // 定数（クラスキャストの例外用）
 private static final Object CONST_OBJ_FOR_CLASS_CAST = 100;

  // 定数（メッセージ）
 private static final String CONST_COMMON_INIT_INFO = "\n■3-3-4:ExException 入力値「1: 続行」／「-1: 終了」";
 private static final String CONST_COMMON_TASK_INPUT_NAME = "以下の例外を発生させるためのパラメーター（1〜3）のいずれかを入力してください。\n・1: NullPointerException\n・2: ArrayIndexOutOfBoundsException\n・3: ClassCastException";
 private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
 private static final String CONST_MSG_NOT_EXCEPTION_TRIGGER = "例外の発生しないパラメーターです。";
 private static final String CONST_MSG_NULLPO = "ヌルポです。";

 public static void main(String[] args) {

  // 変数定義
 int parameter;
 int retryCounter = 0;
 Scanner sc;





 //「{」から「}」のブロック内に記述された文を実行します。そして条件式を評価しtrueだった場合には再度ブロック内の処理を行いますが
 //falseだった場合にはdo..while文を終了して次の文へ処理が移ります。

 do {

 System.out.println(CONST_COMMON_INIT_INFO);
 sc = new Scanner(System.in);

 try {



	 //finalは変えられない。
 final int execute = sc.nextInt();



 //aとbが等しい時はtureで、-1になったらループ自体を抜ける。
  // 早期処理戻し
 if (execute == -1) break;



 //aとbが等しい時、エラー入力値が不正です。が表示され、次のループへ行く。
  // オペレーションエラー
 if (execute != 1) {
 System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
 continue;
 }



 //parameterは、finalで変えられない。
 System.out.println(CONST_COMMON_TASK_INPUT_NAME);
 parameter = sc.nextInt();



 //()内の数字の処理に移動し、その後はbreakでループから脱する。
 switch (parameter) {
 case CONST_EXCEPTION_TRIGER_NULL:
  // 問①: 強制的に「NullPointerException」を発生させるメソッドを作成し、呼び出しなさい。
  // 問①は最下部にもあります。
  // ルール: ここへ作成したメソッドを呼び出す
	 nullpointer();
 break;
 case CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS:
  // 問②: 「throw」を使用せずに「ArrayIndexOutOfBoundsException」を発生させる処理を記述しなさい。
  // Tips: ご自身で配列を準備してください（使用する配列の型、要素数は自由）
  // ここへ記述
	 int array[] = {1, 2, 3, 4, 5};
	 System.out.println(array[9]);

 break;
 case CONST_EXCEPTION_TRIGER_CAST:
 String castedStrValue = (String) CONST_OBJ_FOR_CLASS_CAST;
 System.out.println(castedStrValue);
 break;
 default:
 System.out.println(CONST_MSG_NOT_EXCEPTION_TRIGGER);
 break;
 }

 } catch (NullPointerException e) {
 printException(e);
 System.out.println(CONST_MSG_NULLPO);

 } catch (ArrayIndexOutOfBoundsException e) {
 printException(e);
  // 問③: クラスキャストの例外をキャッチしなさい。
  // ルール: 上述の他の例外同様引、数名は「e」で記述すること。
 } /* ここへ記述 */
 catch (ClassCastException e) {
  printException(e);
 } finally {
 System.out.println("リトライ回数 = " + retryCounter++);
 }
 } while (true);






  // 終了処理
 sc.close();
 System.out.println("お疲れ様でした！");
 }

 /**
 * 問①: 以下のルールに沿ってNullPointerExceptionを投げるメソッドを実装しなさい。
 * ルール1: private static void 任意のメソッド名 throws 上位へ投げるExceptionクラス名 { NullPointerExceptionを発生させる処理 }
 * ルール2: 例外発生時に設定するメッセージは、定義済みの定数から適当なものを指定してください。
 */
  // ここへ記述
 private static void nullpointer() throws NullPointerException {
	 throw new NullPointerException(CONST_MSG_NULLPO);

     // 指定ファイルが未存在の場合に例外発生

 }



 /**
 * 例外処理のメッセージを出力
 *
 * @param e 発生した例外
 */
 private static void printException(final Exception e) {
 System.out.println(e);
 }
}