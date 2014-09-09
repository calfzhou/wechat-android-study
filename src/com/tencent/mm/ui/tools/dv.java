package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.c;

final class dv
  implements View.OnTouchListener
{
  dv(MMGestureGallery paramMMGestureGallery)
  {
  }

  private void baF()
  {
    MMGestureGallery.d(this.jTE).removeMessages(2);
  }

  private void gi(boolean paramBoolean)
  {
    MMGestureGallery.y(this.jTE).gj(paramBoolean);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    View localView1 = this.jTE.getSelectedView();
    if ((localView1 instanceof ViewGroup))
    {
      View localView2 = localView1.findViewById(i.axT);
      if ((localView2 == null) || (localView2.getVisibility() == 8))
      {
        if ((MMGestureGallery.e(this.jTE)) && (MMGestureGallery.f(this.jTE) != null) && (paramMotionEvent.getAction() == 1))
          gi(true);
        return false;
      }
      localView1 = localView2.findViewById(i.axK);
      if (localView1 == null)
        return false;
    }
    label959: label978: float f1;
    float f2;
    float f3;
    if ((localView1 instanceof MultiTouchImageView))
    {
      MMGestureGallery.a(this.jTE, (MultiTouchImageView)localView1);
      z.d("dktest", "MMGestureGallery onTouch event.getAction():" + paramMotionEvent.getAction());
      if (paramMotionEvent.getAction() == 0)
      {
        baF();
        MMGestureGallery.d(this.jTE).c(2, 500L, 0L);
        MMGestureGallery.a(this.jTE).aTl();
        MMGestureGallery.a(this.jTE, 0.0F);
        MMGestureGallery.b(this.jTE, MMGestureGallery.a(this.jTE).getScale());
        z.d("dktest", "originalScale :" + MMGestureGallery.g(this.jTE));
        MMGestureGallery.a(this.jTE, false);
        MMGestureGallery.h(this.jTE);
        if (MMGestureGallery.i(this.jTE) == 1)
        {
          MMGestureGallery.a(this.jTE, System.currentTimeMillis());
          MMGestureGallery.c(this.jTE, c.e(paramMotionEvent, 0));
          MMGestureGallery.d(this.jTE, c.f(paramMotionEvent, 0));
        }
      }
      else
      {
        if ((paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 262))
        {
          baF();
          MMGestureGallery.a(this.jTE, 0.0F);
          MMGestureGallery.b(this.jTE, MMGestureGallery.a(this.jTE).getScale());
          MMGestureGallery.a(this.jTE, true);
          if (MMGestureGallery.g(this.jTE) < MMGestureGallery.a(this.jTE).aTh())
          {
            float f5 = c.e(paramMotionEvent, 0) - c.e(paramMotionEvent, 1);
            float f6 = c.f(paramMotionEvent, 0) - c.f(paramMotionEvent, 1);
            MMGestureGallery.a(this.jTE).q(f5 + c.e(paramMotionEvent, 1), f6 + c.f(paramMotionEvent, 1));
          }
        }
        if (paramMotionEvent.getAction() == 1)
        {
          baF();
          MMGestureGallery.n(this.jTE);
          MMGestureGallery.o(this.jTE);
          if (MMGestureGallery.p(this.jTE))
          {
            MMGestureGallery.q(this.jTE);
            MMGestureGallery.a(this.jTE, new eb(this.jTE));
            MMGestureGallery.r(this.jTE);
          }
          if (MMGestureGallery.s(this.jTE))
          {
            MMGestureGallery.t(this.jTE);
            MMGestureGallery.a(this.jTE, new ed(this.jTE));
            MMGestureGallery.r(this.jTE);
          }
          MMGestureGallery.a(this.jTE, 0.0F);
          MMGestureGallery.b(this.jTE, MMGestureGallery.a(this.jTE).getScale());
          if (MMGestureGallery.i(this.jTE) == 1)
          {
            MMGestureGallery.c(this.jTE, System.currentTimeMillis());
            if (MMGestureGallery.k(this.jTE) - MMGestureGallery.u(this.jTE) >= 350L)
              break label959;
            if ((Math.abs(MMGestureGallery.l(this.jTE) - c.e(paramMotionEvent, 0)) < 10.0F) && (Math.abs(MMGestureGallery.m(this.jTE) - c.f(paramMotionEvent, 0)) < 10.0F))
              gi(false);
          }
        }
      }
      while (true)
      {
        if ((paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 261))
        {
          MMGestureGallery.a(this.jTE, 0.0F);
          MMGestureGallery.b(this.jTE, MMGestureGallery.a(this.jTE).getScale());
          MMGestureGallery.a(this.jTE, true);
        }
        if (paramMotionEvent.getAction() != 2)
          break label1062;
        if (c.k(paramMotionEvent) != 2)
          break label1125;
        baF();
        if ((!MMGestureGallery.v(this.jTE)) && (!MMGestureGallery.p(this.jTE)) && (!MMGestureGallery.s(this.jTE)))
          break label978;
        return true;
        if (MMGestureGallery.i(this.jTE) != 2)
          break;
        MMGestureGallery.b(this.jTE, System.currentTimeMillis());
        if (MMGestureGallery.j(this.jTE) - MMGestureGallery.k(this.jTE) < 350L)
        {
          if ((Math.abs(MMGestureGallery.l(this.jTE) - c.e(paramMotionEvent, 0)) < 35.0F) && (Math.abs(MMGestureGallery.m(this.jTE) - c.f(paramMotionEvent, 0)) < 35.0F))
          {
            MMGestureGallery.a(this.jTE, 0);
            z.d("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "double click!");
            if (MMGestureGallery.a(this.jTE).getScale() <= MMGestureGallery.a(this.jTE).aTh())
            {
              MMGestureGallery.a(this.jTE).s(c.e(paramMotionEvent, 0), c.f(paramMotionEvent, 0));
              break;
            }
            MMGestureGallery.a(this.jTE).q(c.e(paramMotionEvent, 0), c.f(paramMotionEvent, 0));
            break;
          }
          MMGestureGallery.a(this.jTE, 1);
          break;
        }
        MMGestureGallery.a(this.jTE, 1);
        break;
        MMGestureGallery.a(this.jTE, 0);
        z.d("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "single long click over!");
      }
      MMGestureGallery.a(this.jTE, true);
      MMGestureGallery.a(this.jTE, 0);
      f1 = c.e(paramMotionEvent, 0) - c.e(paramMotionEvent, 1);
      f2 = c.f(paramMotionEvent, 0) - c.f(paramMotionEvent, 1);
      f3 = (float)Math.sqrt(f1 * f1 + f2 * f2);
      if (MMGestureGallery.w(this.jTE) != 0.0F)
        break label1064;
      MMGestureGallery.a(this.jTE, f3);
    }
    while (true)
    {
      label1062: return false;
      label1064: float f4 = f3 / MMGestureGallery.w(this.jTE);
      if (MMGestureGallery.x(this.jTE))
      {
        MMGestureGallery.a(this.jTE).d(f4 * MMGestureGallery.g(this.jTE), f1 + c.e(paramMotionEvent, 1), f2 + c.f(paramMotionEvent, 1));
        continue;
        label1125: if ((Math.abs(MMGestureGallery.l(this.jTE) - c.e(paramMotionEvent, 0)) > 10.0F) || (Math.abs(MMGestureGallery.m(this.jTE) - c.f(paramMotionEvent, 0)) > 10.0F))
        {
          baF();
          MMGestureGallery.a(this.jTE, 0);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dv
 * JD-Core Version:    0.6.2
 */