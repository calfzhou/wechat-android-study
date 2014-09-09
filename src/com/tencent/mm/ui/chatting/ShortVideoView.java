package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.tencent.mm.pluginsdk.ui.tools.MMVideoView;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public class ShortVideoView extends MMVideoView
{
  private View.OnClickListener eRh = new oi(this);
  private g jvR = new oh(this);
  private int position;

  public ShortVideoView(Context paramContext)
  {
    super(paramContext);
  }

  public ShortVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ShortVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onAttachedToWindow()
  {
    z.d("!32@/B4Tb64lLpI1d+8HkdT3mC3T0G5ZK8MW", "on attached from window");
    super.onAttachedToWindow();
    a.aGB().a("ChattingUIStatusChanged", this.jvR);
  }

  protected void onDetachedFromWindow()
  {
    z.d("!32@/B4Tb64lLpI1d+8HkdT3mC3T0G5ZK8MW", "on detached from window");
    super.onDetachedFromWindow();
    a.aGB().b("ChattingUIStatusChanged", this.jvR);
  }

  public final void w(int paramInt)
  {
    this.position = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ShortVideoView
 * JD-Core Version:    0.6.2
 */