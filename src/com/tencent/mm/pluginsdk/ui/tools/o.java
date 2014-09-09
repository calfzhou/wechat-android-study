package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.au;

final class o extends au
{
  private View eET;
  private BaseAdapter fvx;
  private ListView hKH;
  private Button hKI;
  private Button hKJ;
  private View hKK;
  private AdapterView.OnItemClickListener hKL;
  private View.OnClickListener hKM;
  private View.OnClickListener hKq;
  private TextView kH;
  private Context mContext;
  private String mTitle;

  public o(AppChooserUI paramAppChooserUI, Context paramContext)
  {
    super(paramContext, com.tencent.mm.o.cuM);
    this.mContext = paramContext;
    this.eET = View.inflate(this.mContext, k.baP, null);
    this.kH = ((TextView)this.eET.findViewById(i.agk));
    this.hKH = ((ListView)this.eET.findViewById(i.agc));
    this.hKI = ((Button)this.eET.findViewById(i.afT));
    this.hKJ = ((Button)this.eET.findViewById(i.afU));
    this.hKK = this.eET.findViewById(i.agl);
  }

  public final void a(BaseAdapter paramBaseAdapter)
  {
    this.fvx = paramBaseAdapter;
  }

  public final void dY(boolean paramBoolean)
  {
    if (this.hKI != null)
      this.hKI.setEnabled(paramBoolean);
    if (this.hKJ != null)
      this.hKJ.setEnabled(paramBoolean);
  }

  public final void j(View.OnClickListener paramOnClickListener)
  {
    this.hKM = paramOnClickListener;
  }

  public final void k(View.OnClickListener paramOnClickListener)
  {
    this.hKq = paramOnClickListener;
  }

  public final void onBackPressed()
  {
    this.hKu.finish();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.eET);
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.hKL = paramOnItemClickListener;
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.mTitle = paramCharSequence.toString();
      return;
    }
    this.mTitle = null;
  }

  public final void show()
  {
    if (ch.jb(this.mTitle))
    {
      this.hKK.setVisibility(8);
      this.kH.setVisibility(8);
    }
    while (true)
    {
      if (this.hKL != null)
        this.hKH.setOnItemClickListener(this.hKL);
      if (this.fvx != null)
        this.hKH.setAdapter(this.fvx);
      if (this.hKI != null)
        this.hKI.setOnClickListener(this.hKM);
      if (this.hKJ != null)
        this.hKJ.setOnClickListener(this.hKq);
      super.show();
      return;
      this.hKK.setVisibility(0);
      this.kH.setVisibility(0);
      this.kH.setText(this.mTitle);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.o
 * JD-Core Version:    0.6.2
 */