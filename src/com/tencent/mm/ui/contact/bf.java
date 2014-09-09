package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.ui.base.cm;
import java.io.File;

final class bf
  implements cm
{
  bf(bd parambd)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 0:
      if (!ContactRemarkImagePreviewUI.b(this.jyL.jyK))
      {
        ContactRemarkImagePreviewUI.a(this.jyL.jyK, true);
        return;
      }
      new File(ContactRemarkImagePreviewUI.c(this.jyL.jyK)).delete();
      ContactRemarkImagePreviewUI.a(this.jyL.jyK, true);
      return;
    case 1:
      bc.j(ContactRemarkImagePreviewUI.c(this.jyL.jyK), this.jyL.jyK);
      return;
    case 2:
    }
    ContactRemarkImagePreviewUI.d(this.jyL.jyK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bf
 * JD-Core Version:    0.6.2
 */