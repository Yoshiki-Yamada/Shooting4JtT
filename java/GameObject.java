import java.awt.*;
import java.awt.event.*;

/**
*ゲームオブジェクト抽象クラス<p>
*プレイヤー、弾、敵などのスーパークラス
* @author Yoshiki-Yamada
*/
public abstract class GameObject
{
	/**
	 * インスタンス有効フラグ（falseならインスタンスは処理されない）
	*/
    public boolean active;
	/**
	 * 座標のx成分
	*/
	public double x;
	/**
	 * 座標のy成分
	*/
	public double y;

	/**
	 * ステップ毎に実行されるメソッド
	 */
    abstract void move();

	/**
	 * 描画
	 */
    abstract void draw(Graphics g);
}

