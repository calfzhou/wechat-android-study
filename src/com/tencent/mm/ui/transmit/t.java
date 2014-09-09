package com.tencent.mm.ui.transmit;

import com.tencent.mm.plugin.base.stub.h;
import com.tencent.mm.sdk.platformtools.z;

final class t
  implements h
{
  t(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void aq(boolean paramBoolean)
  {
    boolean bool = this.jYz.isFinishing();
    z.d("!44@/B4Tb64lLpJQGo7VtHU/glxECqNzQuUbU+29i/gx8/w=", "onCheckEnd, isPass = " + paramBoolean + ", isFinishing = " + bool);
    if ((!paramBoolean) && (!bool))
      this.jYz.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.t
 * JD-Core Version:    0.6.2
 */