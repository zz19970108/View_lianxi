package bawei.com.view_lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dell on 2017/11/30.
 */

public class MyView extends View{
    Paint p=null;
    // 环形渐变渲染
    Shader s=null;
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context) {
        super(context);
        s = new RadialGradient(240, 240, 240, new int[] {
                Color.YELLOW, Color.GREEN, Color.TRANSPARENT, Color.RED }, null,
                Shader.TileMode.REPEAT);

        p = new Paint();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制环形渐变
        p.setShader(s);
        p.setAntiAlias(true);//设置画笔的锯齿效果
        // 第一个,第二个参数表示圆心坐标
        // 第三个参数表示半径
        canvas.drawCircle(280, 360, 200, p);

    }
}
