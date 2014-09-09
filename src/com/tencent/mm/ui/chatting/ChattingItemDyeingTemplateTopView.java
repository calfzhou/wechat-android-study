package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;

public class ChattingItemDyeingTemplateTopView extends View
{
  private int color = -1;
  private Paint emx = new Paint(1);
  private final int jpc;
  private final int jpd;

  public ChattingItemDyeingTemplateTopView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public ChattingItemDyeingTemplateTopView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ChattingItemDyeingTemplateTopView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jpc = e.a(paramContext, 5.0F);
    this.jpd = e.a(paramContext, 2.0F);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGlSyy4QLq76aFh6v8KH3Ep", "onDraw, paint color(hex) = " + Integer.toHexString(this.color) + ", height = " + this.jpc);
    this.emx.setColor(this.color);
    paramCanvas.drawCircle(this.jpd, this.jpd, this.jpd, this.emx);
    paramCanvas.drawCircle(getWidth() - this.jpd, this.jpd, this.jpd, this.emx);
    paramCanvas.drawRect(this.jpd, 0.0F, getWidth() - this.jpd, this.jpd, this.emx);
    paramCanvas.drawRect(0.0F, this.jpd, getWidth(), this.jpc, this.emx);
  }

  public final void setColor(int paramInt)
  {
    z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGlSyy4QLq76aFh6v8KH3Ep", "setColor, color(hex) = " + Integer.toHexString(paramInt));
    this.color = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingItemDyeingTemplateTopView
 * JD-Core Version:    0.6.2
 */