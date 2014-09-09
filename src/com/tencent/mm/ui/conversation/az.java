package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;

final class az extends g
{
  az(aj paramaj)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (aj.b(this.jGZ) != null)
      aj.b(this.jGZ).getView().post(new ba(this));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.az
 * JD-Core Version:    0.6.2
 */