package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import com.tencent.mm.model.cg;
import com.tencent.mm.network.r;

final class i
  implements cg
{
  i(UIEntryStub paramUIEntryStub)
  {
  }

  public final void a(r paramr)
  {
    if (paramr == null)
    {
      this.ehK.finish();
      return;
    }
    UIEntryStub.a(this.ehK, UIEntryStub.a(this.ehK).getExtras());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.i
 * JD-Core Version:    0.6.2
 */