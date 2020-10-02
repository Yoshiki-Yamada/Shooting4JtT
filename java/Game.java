import java.awt.*;
import java.awt.event.*;

/**
*ゲームクラス（ここから始まる）<p>
*画面の作成
* @author Yoshiki-Yamada
*/
public class Game extends Frame
{
	/**
	 * メインクラス
	 */
	public static void main(String args[])
	{
		//フレームの作成
		new Game();
	}
	
	/**
	 * 引数なしのコンストラクタ
	 */
	Game()
	{
		//*** ウィンドウの初期化
		//タイトル
		super("Shooting Game");

		//クローズボタンによる終了処理の実装
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
		
		setSize(500, 500);		//ウィンドウのサイズ

		//*** キャンバスの初期化
		MyCanvas mc = new MyCanvas();
		add(mc);				//フレームにキャンバスを追加
		setVisible(true);		//ウィンドウの表示
		//ゲームデータの初期化
		mc.init();
		//スレッドを作成
		mc.initThread();
	}
}

