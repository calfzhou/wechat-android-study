package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.MMWizardActivity;

final class ag
  implements m
{
  ag(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (FindMContactAddUI.a(this.jIz) != null)
    {
      FindMContactAddUI.a(this.jIz).dismiss();
      FindMContactAddUI.b(this.jIz);
    }
    if (FindMContactAddUI.o(this.jIz) != null)
    {
      bg.qX().b(30, FindMContactAddUI.o(this.jIz));
      FindMContactAddUI.p(this.jIz);
    }
    if ((FindMContactAddUI.k(this.jIz) != null) && (FindMContactAddUI.k(this.jIz).contains("2")))
    {
      Intent localIntent = new Intent(this.jIz, FindMContactInviteUI.class);
      localIntent.putExtra("regsetinfo_ticket", FindMContactAddUI.l(this.jIz));
      localIntent.putExtra("login_type", FindMContactAddUI.m(this.jIz));
      localIntent.putExtra("regsetinfo_NextStyle", FindMContactAddUI.e(this.jIz));
      MMWizardActivity.j(this.jIz, localIntent);
      return;
    }
    FindMContactAddUI.n(this.jIz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ag
 * JD-Core Version:    0.6.2
 */