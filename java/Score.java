import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
*スコアクラス<p>
*得点の制御、表示
* @author ¥oshiki-Yamada
*/
public class Score
{
	static int myscore;
	static int hiscore;
	Font scoreFont;
	
	/**
	 * コンストラクタ
	 */
	Score()
	{
		scoreFont = new Font("sansserif", Font.BOLD, 10);
		myscore = 0;
	}
	
	/**
	 * スコアの描画
	 * @param g 描画先グラフィックハンドル
	 */
	public void drawScore(Graphics g)
	{
		g.setColor(Color.black);
		g.setFont(scoreFont);
		g.drawString("score:"+myscore, 30, 30);
	}
	
	/**
	 * ハイスコアの描画
	 * @param g 描画先グラフィックハンドル
	 */
	public void drawHiScore(Graphics g)
	{
		g.setColor(Color.black);
		g.setFont(scoreFont);
		g.drawString("hiscore:"+hiscore, 420, 30);
	}
	
	
	/**
	 * スコアに追加
	 * @param gain 追加する得点
	 */
	public static void addScore(int gain)
	{
		myscore += gain;
	}
	
	/**
	 * ハイスコア更新処理<p>
	 * ハイスコアを越えていたら、スコアを外部ファイルに保存する。
	 */
	public static void compareScore()
	{
		//ハイスコアを更新
		if (myscore > hiscore)
		{
			hiscore = myscore;
			saveScore();
		}
	}


	/**
	 * スコア保存処理<p>
	 * data.datにバイナリ形式で保存する。
	 */
	static void saveScore()
	{
//            DataOutputStream dout = new DataOutputStream(new FileOutputStream("data.dat"));
//            dout.writeInt(hiscore);
//            dout.close();
	}

	/**
	 * スコア読み込み処理<p>
	 * data.datからバイナリ形式で読み込む。
	 */
	static void loadScore()
	{
//            DataInputStream din = new DataInputStream(new FileInputStream("data.dat"));
//            hiscore = din.readInt();
//            din.close();
	}




	//スコアの初期化
	public static void initScore()
	{
		myscore = 0;
	}
}

