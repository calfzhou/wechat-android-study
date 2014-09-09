package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class fi
  implements View.OnClickListener
{
  fi(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.jBX, GroupCardSelectUI.class);
    localIntent.putExtra("group_select_type", true);
    localIntent.putExtra("group_select_need_result", true);
    this.jBX.startActivityForResult(localIntent, 4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fi
 * JD-Core Version:    0.6.2
 */