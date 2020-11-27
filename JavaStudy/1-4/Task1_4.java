public class Task1_4 {

    // 定数（アカウント情報）
    // ① 登録されている名前とパスワードを定数で定義してください。
    final String name = "alice";
    final String pass = "pass";

    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args) {
        // 以下の変数「name（名前）」「pass（パスワード）」を使用して、②〜⑤の条件を満たす処理を記述してください。
        // 名前とパスワードは画面からの入力値だと想定してみましょう。
         String name = "alice";
         String pass = "pass";
        // ② 名前が「 alice 」、パスワードが「 pass 」であった場合、「 ログイン成功です 」と出力してください。
        if (name.equals("alice") && pass.equals("pass")) {
            System.out.println( CONST_MSG_SUCCESS ); 

        // ③ 名前のみ正しい場合、「 パスワードに誤りがあります。 」と出力してください。
    } else if (name.equals("alice")) {
            System.out.println( CONST_MSG_ERROR_PASS ); 

        // ④ パスワードのみ正しい場合、「 名前に誤りがあります。 」と出力してください。
    } else if (pass.equals("pass")) {
            System.out.println( CONST_MSG_ERROR_NAME ); 
    
        // ⑤ 名前もパスワードも間違っていた場合は、「 入力情報に誤りがあります。 」と出力してください。    
        
        } else { 
            System.out.println( CONST_MSG_ERROR_INPUT ); 

        }
    
    }
}
        



    
