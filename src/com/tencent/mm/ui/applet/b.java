package com.tencent.mm.ui.applet;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class b
{
  private int Iz;
  private int direction = 0;
  private MessageQueue.IdleHandler iJS;
  private g iVD;
  private LinkedList iVE;
  private e iVF;
  private GestureDetector iVG = new GestureDetector(new d(this));

  public b(e parame)
  {
    this.iVF = parame;
    this.Iz = 15;
    this.iVD = new g(this, 40);
    this.iVE = new LinkedList();
    this.iJS = new c(this);
    Looper.myQueue().addIdleHandler(this.iJS);
  }

  public final void a(int paramInt, f paramf)
  {
    if (paramf == null)
      z.e("!44@/B4Tb64lLpJspJHBv5qC7V5a0uLUZHReE2O/w9CK6JI=", "earlyGet, getter is null, no early get headimg will be performed");
    int i;
    int j;
    label37: 
    do
    {
      return;
      if (this.Iz <= 0)
      {
        z.e("!44@/B4Tb64lLpJspJHBv5qC7V5a0uLUZHReE2O/w9CK6JI=", "earlyGet fail, threshold is invalid");
        return;
      }
      i = paramf.vX();
      j = 1;
      if (j > this.Iz)
        break;
      if (this.direction != 1)
        break label123;
    }
    while (paramInt - j < 0);
    String str2 = paramf.dv(paramInt - j);
    if ((str2 != null) && (str2.length() != 0) && (!this.iVD.contains(str2)))
    {
      this.iVD.vd(str2);
      this.iVE.add(str2);
    }
    while (true)
    {
      j++;
      break label37;
      break;
      label123: if (paramInt + j >= i)
        break;
      String str1 = paramf.dv(paramInt + j);
      if ((str1 != null) && (str1.length() != 0) && (!this.iVD.contains(str1)))
      {
        this.iVD.vd(str1);
        this.iVE.add(str1);
      }
    }
  }

  public final void detach()
  {
    if (this.iJS != null)
      Looper.myQueue().removeIdleHandler(this.iJS);
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.iVG != null)
      this.iVG.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.b
 * JD-Core Version:    0.6.2
 */