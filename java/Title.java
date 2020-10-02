import java.awt.*;
import java.awt.event.*;

/**
*タイトルクラス<p>
*タイトル画面描画<p>
*ゲームオーバー画面表示
* @author Yoshiki-Yamada
*/
public class Title
{
	//アニメーション用カウンタ
	int count;
	Font titleFont;
	Font infoFont;
	
	/**
	 * コンストラクタ<p>
	 * タイトル用に、フォントクラスのインスタンスを生成する
	 */
	Title()
	{
		count = 0;
		titleFont = new Font("sansserif", Font.BOLD, 30);
		infoFont = new Font("sansserif", Font.BOLD, 11);
	}
	
	/**
	 * タイトル画面の描画処理。
	 * １ループで一回呼ばれる。
	 * @param g 描画先グラフィックハンドル
	 */
	public void drawTitle(Graphics g)
	{
		g.setColor(Color.black);
		count++;
		g.setFont(titleFont);
		g.drawString("S h o o t i n g",150,150);

		//点滅させる
		if (count%2 == 0)
		{
			g.setFont(infoFont);
			g.drawString("hit SPACE key",200,350);
		}
	}

	/**
	 * ゲームオーバーの描画処理。
	 * １ループで一回呼ばれる。
	 * @param g 描画先グラフィックハンドル
	 */
	public void drawGameover(Graphics g)
	{
		g.setColor(Color.black);
		count++;
		g.setFont(titleFont);
		g.drawString("GAMEOVER",150,150);
	}
	
}

