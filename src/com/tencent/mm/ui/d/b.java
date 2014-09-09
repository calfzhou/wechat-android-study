package com.tencent.mm.ui.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cn;

public final class b extends cn
{
  public long ddc = 3000L;

  @SuppressLint({"HandlerLeak"})
  private cm mHandler = new c(this);

  private b(View paramView)
  {
    super(paramView);
  }

  public static b cA(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(k.boI, null);
    ((TextView)localView.findViewById(i.aTo)).setVisibility(8);
    b localb = new b(localView);
    localb.setFocusable(false);
    localb.setContentView(localView);
    localb.setWidth(-1);
    localb.setHeight(-1);
    localb.setAnimationStyle(o.cuH);
    localb.ddc = 1200L;
    return localb;
  }

  public final void showAsDropDown(View paramView)
  {
    super.showAsDropDown(paramView);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.ddc);
  }

  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    super.showAsDropDown(paramView, paramInt1, paramInt2);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.ddc);
  }

  public final void showAtLocation(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.ddc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d.b
 * JD-Core Version:    0.6.2
 */