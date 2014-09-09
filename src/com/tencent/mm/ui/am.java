package com.tencent.mm.ui;

import com.tencent.mm.k.a;
import com.tencent.mm.k.c;
import com.tencent.mm.k.i;

final class am
  implements c
{
  am(LauncherUI paramLauncherUI)
  {
  }

  public final void cD(int paramInt)
  {
    if ((paramInt == 262145) || (paramInt == 262148) || (paramInt == 262152))
      LauncherUI.m(this.iKj);
    if ((paramInt == 262147) || (paramInt == 262149))
      LauncherUI.m(this.iKj);
  }

  public final void dl(int paramInt)
  {
    if (paramInt == 266241)
      LauncherUI.m(this.iKj);
    if (paramInt == 266244)
    {
      i.Ck().K(262147, 266241);
      i.Ck().K(262149, 266241);
      LauncherUI.m(this.iKj);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.am
 * JD-Core Version:    0.6.2
 */