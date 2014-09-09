package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.SayHiEditUI;

final class dl
  implements View.OnClickListener
{
  dl(dk paramdk)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(NormalUserFooterPreference.b(this.jEH.jEw), SayHiEditUI.class);
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.jEH.jEw).getUsername());
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.k(this.jEH.jEw));
    NormalUserFooterPreference.b(this.jEH.jEw).startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dl
 * JD-Core Version:    0.6.2
 */