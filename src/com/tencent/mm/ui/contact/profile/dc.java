package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.SayHiEditUI;

final class dc
  implements View.OnClickListener
{
  dc(db paramdb)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(NormalUserFooterPreference.b(this.jEF.jEw), SayHiEditUI.class);
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.jEF.jEw).getUsername());
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.k(this.jEF.jEw));
    NormalUserFooterPreference.b(this.jEF.jEw).startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dc
 * JD-Core Version:    0.6.2
 */