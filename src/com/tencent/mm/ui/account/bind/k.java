package com.tencent.mm.ui.account.bind;

import android.content.Intent;
import android.widget.CheckBox;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.cw;

final class k
  implements cw
{
  k(BindMobileUI paramBindMobileUI, String paramString)
  {
  }

  public final void pf(int paramInt)
  {
    int i = 1;
    if (paramInt == i)
      if (BindMobileUI.h(this.iTO))
      {
        localBindMobileUI = this.iTO;
        if (!BindMobileUI.i(this.iTO).isChecked())
        {
          j = i;
          if (BindMobileUI.j(this.iTO).isChecked())
            break label74;
          BindMobileStatusUI.a(localBindMobileUI, j, i);
          BindMobileUI.k(this.iTO);
        }
      }
    label74: 
    while (paramInt != 2)
    {
      while (true)
      {
        BindMobileUI localBindMobileUI;
        int j;
        return;
        int k = 0;
        continue;
        i = 0;
      }
      Intent localIntent = new Intent(this.iTO, BindMobileStatusUI.class);
      localIntent.putExtra("kstyle_bind_wording", BindMobileUI.l(this.iTO));
      localIntent.putExtra("kstyle_bind_recommend_show", BindMobileUI.m(this.iTO));
      localIntent.putExtra("Kfind_friend_by_mobile_flag", BindMobileUI.i(this.iTO).isChecked());
      localIntent.putExtra("Krecom_friends_by_mobile_flag", BindMobileUI.j(this.iTO).isChecked());
      MMWizardActivity.j(this.iTO, localIntent);
      return;
    }
    BindMobileUI.d(this.iTO, this.iTP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.k
 * JD-Core Version:    0.6.2
 */