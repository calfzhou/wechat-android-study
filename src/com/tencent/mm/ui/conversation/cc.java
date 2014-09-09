package com.tencent.mm.ui.conversation;

import com.tencent.mm.model.ao;

final class cc
  implements ao
{
  cc(aj paramaj)
  {
  }

  public final void mj()
  {
    aj.h(this.jGZ);
  }

  public final void onFinish()
  {
    aj.h(this.jGZ);
  }

  public final void onPause()
  {
    aj.h(this.jGZ);
  }

  public final void onResume()
  {
    aj.g(this.jGZ);
    if (aj.e(this.jGZ) != null)
      aj.e(this.jGZ).notifyDataSetChanged();
  }

  public final void onStart()
  {
  }

  public final void onStop()
  {
    aj.h(this.jGZ);
  }

  public final void w(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.cc
 * JD-Core Version:    0.6.2
 */