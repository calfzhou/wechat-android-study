package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;

final class u
  implements View.OnTouchListener
{
  u(ChatFooter paramChatFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramView != ChatFooter.s(this.hDT));
    do
    {
      do
      {
        do
        {
          return false;
          z.v("RcdBtnEvent", "event.getAction():" + paramMotionEvent.getAction());
          switch (paramMotionEvent.getAction())
          {
          default:
            return false;
          case 0:
            Object[] arrayOfObject5 = new Object[1];
            arrayOfObject5[0] = Integer.valueOf(ChatFooter.Bv());
            z.i("RcdBtnEvent", "on MotionEvent.ACTION_DOWN:[%d]", arrayOfObject5);
          case 2:
          case 1:
          }
        }
        while ((ChatFooter.t(this.hDT)) || (ChatFooter.u(this.hDT)));
        ChatFooter.c(this.hDT, true);
        ChatFooter.s(this.hDT).setBackgroundDrawable(a.n(this.hDT.getContext(), h.ZF));
        ChatFooter.s(this.hDT).setText(n.bys);
        ChatFooter.i(this.hDT).YT();
        ChatFooter.s(this.hDT).setContentDescription(this.hDT.getContext().getString(n.fgT));
        return false;
        if ((ChatFooter.v(this.hDT) == null) || (ChatFooter.w(this.hDT) == null))
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = ChatFooter.v(this.hDT);
          arrayOfObject3[1] = ChatFooter.w(this.hDT);
          z.e("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "[arthurdan.initRcdBtn] Notice!!! rcdAnimArea is %s, rcdCancelArea is %s", arrayOfObject3);
        }
        if ((paramMotionEvent.getX() <= 0.0F) || (paramMotionEvent.getY() <= -ChatFooter.x(this.hDT) / 2) || (paramMotionEvent.getX() >= ChatFooter.s(this.hDT).getWidth()))
          break;
        if (ChatFooter.v(this.hDT) != null)
          ChatFooter.v(this.hDT).setVisibility(0);
      }
      while (ChatFooter.w(this.hDT) == null);
      ChatFooter.s(this.hDT).setText(n.bys);
      ChatFooter.w(this.hDT).setVisibility(8);
      return false;
      Object[] arrayOfObject4 = new Object[5];
      arrayOfObject4[0] = Float.valueOf(paramMotionEvent.getX());
      arrayOfObject4[1] = Float.valueOf(paramMotionEvent.getY());
      arrayOfObject4[2] = Integer.valueOf(ChatFooter.x(this.hDT));
      arrayOfObject4[3] = Integer.valueOf(ChatFooter.s(this.hDT).getWidth());
      arrayOfObject4[4] = Integer.valueOf(ChatFooter.s(this.hDT).getHeight());
      z.i("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "show cancel Tips, ACTION_MOVE (x:%f y:%f) rcdHintPopUpMarginTop:%d voiceRcdBtn.getWidth():%d voiceRcdBtn.getHeight():%d", arrayOfObject4);
      if (ChatFooter.v(this.hDT) != null)
        ChatFooter.v(this.hDT).setVisibility(8);
    }
    while (ChatFooter.w(this.hDT) == null);
    ChatFooter.s(this.hDT).setText(n.byq);
    ChatFooter.w(this.hDT).setVisibility(0);
    return false;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(ChatFooter.Bv());
    z.i("RcdBtnEvent", "enter on MotionEvent.ACTION_UP:[%d]", arrayOfObject1);
    ChatFooter.y(this.hDT);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(ChatFooter.Bt());
    z.i("RcdBtnEvent", "outer on MotionEvent.ACTION_UP:[%d]", arrayOfObject2);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.u
 * JD-Core Version:    0.6.2
 */