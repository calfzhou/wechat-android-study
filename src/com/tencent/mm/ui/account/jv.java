package com.tencent.mm.ui.account;

import android.os.Bundle;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.c.a.d;
import com.tencent.mm.ui.c.a.g;
import com.tencent.mm.ui.c.a.h;

final class jv
  implements g
{
  jv(ju paramju)
  {
  }

  public final void a(Bundle paramBundle)
  {
    z.i("!44@/B4Tb64lLpKs6AITiyR7C0zDfpUiw7AtPQj2hkLhcu8=", "fbinvite oncomplete");
    e.a(this.iSJ.iSI.aPI(), n.bGV, n.buo, new jw(this));
  }

  public final void a(d paramd)
  {
    z.e("!44@/B4Tb64lLpKs6AITiyR7C0zDfpUiw7AtPQj2hkLhcu8=", "fbinvite error");
  }

  public final void a(h paramh)
  {
    z.e("!44@/B4Tb64lLpKs6AITiyR7C0zDfpUiw7AtPQj2hkLhcu8=", "fbinvite error");
  }

  public final void onCancel()
  {
    z.e("!44@/B4Tb64lLpKs6AITiyR7C0zDfpUiw7AtPQj2hkLhcu8=", "fbinvite cancle");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jv
 * JD-Core Version:    0.6.2
 */