package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.c;
import java.util.Timer;

final class bi
  implements View.OnTouchListener
{
  bi(CropImageView paramCropImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!CropImageView.u(this.jQc));
    do
    {
      int i;
      do
      {
        do
          return false;
        while (CropImageView.i(this.jQc) == null);
        i = 0xFF & paramMotionEvent.getAction();
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "on touch : event type=" + i + ", isDownOnImg=" + CropImageView.v(this.jQc));
      }
      while ((!CropImageView.v(this.jQc)) && (i != 0));
      switch (i)
      {
      case 3:
      case 4:
      default:
        return false;
      case 0:
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "action_down");
        CropImageView.a(this.jQc, paramMotionEvent.getRawX());
        CropImageView.b(this.jQc, paramMotionEvent.getRawY());
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "lastX=" + CropImageView.w(this.jQc) + ",lastY=" + CropImageView.x(this.jQc));
        CropImageView.c(this.jQc, CropImageView.w(this.jQc));
        CropImageView.d(this.jQc, CropImageView.x(this.jQc));
        Matrix localMatrix = this.jQc.getImageMatrix();
        RectF localRectF = new RectF();
        localRectF.set(0.0F, 0.0F, CropImageView.i(this.jQc).getWidth(), CropImageView.i(this.jQc).getHeight());
        localMatrix.mapRect(localRectF);
        CropImageView.a(this.jQc, localRectF.contains(CropImageView.w(this.jQc), CropImageView.x(this.jQc)));
        CropImageView.a(this.jQc, System.currentTimeMillis());
        return false;
      case 5:
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "action_mult_down");
        CropImageView.b(this.jQc, true);
        this.jQc.faI = c.i(paramMotionEvent);
      case 6:
      case 2:
      case 1:
      }
    }
    while (this.jQc.faI <= 5.0F);
    this.jQc.jPI = true;
    c.a(CropImageView.h(this.jQc), paramMotionEvent);
    return true;
    z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "action_mult_up");
    this.jQc.jPI = false;
    CropImageView.b(this.jQc, true);
    return true;
    z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "action_move");
    if (this.jQc.jPI)
    {
      z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "is valid mult down");
      this.jQc.faJ = c.i(paramMotionEvent);
      float f3 = this.jQc.faJ - this.jQc.faI;
      if ((this.jQc.faJ > 5.0F) && (Math.abs(f3) > 5.0F))
      {
        c.a(CropImageView.h(this.jQc), paramMotionEvent);
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "mX=" + CropImageView.h(this.jQc).x + ",mY=" + CropImageView.h(this.jQc).y);
        if (f3 <= 0.0F)
          break label698;
        z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "zoom in");
        this.jQc.aZS();
      }
    }
    while (true)
    {
      this.jQc.faI = this.jQc.faJ;
      if (!CropImageView.y(this.jQc))
      {
        float f1 = paramMotionEvent.getRawX() - CropImageView.w(this.jQc);
        float f2 = paramMotionEvent.getRawY() - CropImageView.x(this.jQc);
        if ((Math.abs(f1) > 5.0F) || (Math.abs(f2) > 5.0F))
          this.jQc.getImageMatrix().postTranslate(f1, f2);
        this.jQc.invalidate();
      }
      CropImageView.b(this.jQc, false);
      CropImageView.a(this.jQc, paramMotionEvent.getRawX());
      CropImageView.b(this.jQc, paramMotionEvent.getRawY());
      return false;
      label698: z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "zoom out");
      this.jQc.aZT();
    }
    z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "action_up");
    if (CropImageView.z(this.jQc))
    {
      CropImageView.c(this.jQc, false);
      if (CropImageView.A(this.jQc))
      {
        CropImageView.d(this.jQc, false);
        this.jQc.aZT();
        this.jQc.aZT();
        this.jQc.aZT();
        this.jQc.aZT();
        this.jQc.aZT();
        return false;
      }
      CropImageView.d(this.jQc, true);
      this.jQc.aZS();
      this.jQc.aZS();
      this.jQc.aZS();
      this.jQc.aZS();
      this.jQc.aZS();
      return false;
    }
    CropImageView.c(this.jQc, true);
    CropImageView.a(this.jQc, new Timer());
    bj localbj = new bj(this, paramMotionEvent);
    CropImageView.B(this.jQc).schedule(localbj, 200L);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bi
 * JD-Core Version:    0.6.2
 */