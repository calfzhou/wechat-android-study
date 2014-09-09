package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.List;

public class SnsTagContactListUI extends MMActivity
{
  private ListView feW;
  private gg jCA;
  private List jCB = new ArrayList();

  protected final void DP()
  {
    oP(n.ckZ);
    findViewById(i.aAz).setVisibility(8);
    this.feW = ((ListView)findViewById(i.aeA));
    long[] arrayOfLong = getIntent().getLongArrayExtra("sns_tag_list");
    if (arrayOfLong == null)
    {
      finish();
      return;
    }
    for (int i = 0; i < arrayOfLong.length; i++)
      this.jCB.add(Long.valueOf(arrayOfLong[i]));
    ((TextView)findViewById(i.arq)).setVisibility(8);
    findViewById(i.aeL).setVisibility(8);
    this.feW.setBackgroundColor(getResources().getColor(f.white));
    ((View)this.feW.getParent()).setBackgroundColor(getResources().getColor(f.white));
    this.jCA = new gg(this, this.jCB);
    this.feW.setAdapter(this.jCA);
    this.feW.setVisibility(0);
    this.feW.setOnItemClickListener(new ge(this));
    a(new gf(this));
    eC(false);
  }

  protected final int getLayoutId()
  {
    return k.aez;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onResume()
  {
    super.onResume();
    if (this.jCA != null)
      this.jCA.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsTagContactListUI
 * JD-Core Version:    0.6.2
 */