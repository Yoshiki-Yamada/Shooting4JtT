import java.awt.*;
import java.awt.event.*;

/**
*プレイヤークラス<p>
*移動処理、描画処理など
* @author Yoshiki-Yamada
*/
public class Player extends GameObject
{
    double speed;
    
	/**
	 * コンストラクタ
	 * @param ix 生成先のx座標
	 * @param iy 生成先のy座標
	 * @param ispeed 移動スピード
	 */
    Player(double ix, double iy, double ispeed)
    {
        x = ix;
		y = iy;
		speed = ispeed;
		active = false;
	}

    /**
     * ダミー関数<p>
     * (引数がスーパークラスのアブストラクト・メソッドの定義と異なるため)
     */
    public void move()
    {
    }
	
	/**
	 * 移動処理
	 * @param mx x方向の入力(-1 ... +1)
	 * @param my y方向の入力(-1 ... +1)
	 */
	public void move(int mx, int my)
	{
		//Canvasの外には移動できないようにする
		double postX = x + mx * speed;
		double postY = y + my * speed;
		
		if ((0 < postX)&&(postX < 500))
		{
			x = postX;
		}
		if ((0 < postY)&&(postY < 480))
		{
			y = postY;
		}
	}
	
	//描画処理
	public void draw(Graphics g)
	{
		if (active)
		{
			g.setColor(Color.red);
			//三角形の描画
			g.drawLine((int)(x), (int)(y-14), (int)(x-10), (int)(y+7));
			g.drawLine((int)(x), (int)(y-14), (int)(x+10), (int)(y+7));
			g.drawLine((int)(x-10), (int)(y+7), (int)(x+10), (int)(y+7));
		}
	}
	
	
}
