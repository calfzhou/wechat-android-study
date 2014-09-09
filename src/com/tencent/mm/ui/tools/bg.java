package com.tencent.mm.ui.tools;

import android.os.Message;
import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.c;

final class bg extends cm
{
  bg(CropImageView paramCropImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    z.d("!32@/B4Tb64lLpKZO8SHSsYWiU6LrfM7B7iE", "on handler");
    if (paramMessage.what == 4659)
      this.jQc.aZS();
    do
      while (true)
      {
        super.handleMessage(paramMessage);
        return;
        if (paramMessage.what == 4658)
        {
          this.jQc.aZT();
        }
        else
        {
          if (paramMessage.what != 4660)
            break;
          if ((CropImageView.a(this.jQc) != null) && (CropImageView.b(this.jQc) != null))
          {
            CropImageView.b(this.jQc).cancel();
            CropImageView.c(this.jQc);
          }
        }
      }
    while (paramMessage.what != 4661);
    MotionEvent localMotionEvent = (MotionEvent)paramMessage.obj;
    CropImageView.a(this.jQc, System.currentTimeMillis());
    CropImageView.a(this.jQc, false);
    if ((localMotionEvent.getRawX() - CropImageView.d(this.jQc) > 10.0F) || (localMotionEvent.getRawY() - CropImageView.e(this.jQc) > 10.0F) || (localMotionEvent.getRawX() - CropImageView.d(this.jQc) < -10.0F) || (localMotionEvent.getRawY() - CropImageView.e(this.jQc) < -10.0F));
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
      {
        long l = System.currentTimeMillis();
        if ((CropImageView.f(this.jQc) != 0L) && (l - CropImageView.f(this.jQc) < 300L) && (l - CropImageView.f(this.jQc) >= 0L) && (CropImageView.g(this.jQc) != null))
          CropImageView.g(this.jQc).aZO();
        CropImageView.a(this.jQc, 0L);
      }
      c.a(CropImageView.h(this.jQc), CropImageView.i(this.jQc));
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bg
 * JD-Core Version:    0.6.2
 */