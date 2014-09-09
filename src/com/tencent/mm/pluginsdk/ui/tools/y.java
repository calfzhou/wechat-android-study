package com.tencent.mm.pluginsdk.ui.tools;

import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.platformtools.f;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class y extends BaseAdapter
{
  private String gvB;
  private File hLg;
  private File hLh;
  private File[] hLi;

  private y(FileExplorerUI paramFileExplorerUI)
  {
  }

  public final void c(File paramFile1, File paramFile2)
  {
    this.hLg = paramFile1;
    if (paramFile2.getAbsolutePath().equalsIgnoreCase(this.gvB))
      this.hLg = null;
    this.hLh = paramFile2;
    if (this.hLh.canRead())
    {
      this.hLi = this.hLh.listFiles(new z(this));
      File[] arrayOfFile;
      if (this.hLi.length > 0)
      {
        arrayOfFile = this.hLi;
        if ((arrayOfFile != null) && (arrayOfFile.length != 0))
          break label81;
      }
      while (true)
      {
        return;
        label81: ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          File localFile = arrayOfFile[j];
          ac localac = new ac(this.hLd, (byte)0);
          localac.file = localFile;
          localac.hLk = f.jv(localFile.getName()).toUpperCase();
          if (localFile.isDirectory())
            localArrayList1.add(localac);
          while (true)
          {
            j++;
            break;
            localArrayList2.add(localac);
          }
        }
        Collections.sort(localArrayList1, new aa(this));
        Collections.sort(localArrayList2, new ab(this));
        Iterator localIterator1 = localArrayList1.iterator();
        for (int k = 0; localIterator1.hasNext(); k++)
          arrayOfFile[k] = ((ac)localIterator1.next()).file;
        Iterator localIterator2 = localArrayList2.iterator();
        while (localIterator2.hasNext())
        {
          arrayOfFile[k] = ((ac)localIterator2.next()).file;
          k++;
        }
      }
    }
    this.hLi = new File[0];
  }

  public final int getCount()
  {
    if (this.hLi == null)
      return 0;
    int i = this.hLi.length;
    File localFile = this.hLg;
    int j = 0;
    if (localFile != null)
      j = 1;
    return j + i;
  }

  public final Object getItem(int paramInt)
  {
    if ((this.hLg != null) && (paramInt == 0))
      return this.hLg;
    com.tencent.mm.sdk.platformtools.z.d("FileExplorer", "pos:" + paramInt + ", subFile length:" + this.hLi.length);
    File[] arrayOfFile = this.hLi;
    if (this.hLg == null);
    while (true)
    {
      return arrayOfFile[paramInt];
      paramInt--;
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = View.inflate(this.hLd, k.bht, null);
      ad localad2 = new ad(this.hLd, (byte)0);
      localad2.eyY = ((ImageView)paramView.findViewById(i.atp));
      localad2.eSC = ((TextView)paramView.findViewById(i.atv));
      localad2.hLl = ((TextView)paramView.findViewById(i.aty));
      paramView.setTag(localad2);
    }
    ad localad1 = (ad)paramView.getTag();
    File localFile = (File)getItem(paramInt);
    if (localFile == this.hLg)
    {
      localad1.eSC.setText(localFile.getName());
      localad1.eyY.setImageResource(h.YS);
      localad1.hLl.setVisibility(0);
      return paramView;
    }
    ImageView localImageView = localad1.eyY;
    localImageView.setImageResource(FileExplorerUI.j(localFile));
    localad1.eSC.setText(localFile.getName());
    TextView localTextView = localad1.hLl;
    StringBuilder localStringBuilder = new StringBuilder().append(DateFormat.format("yyyy-MM-dd hh:mm:ss", localFile.lastModified()).toString());
    if (localFile.isDirectory());
    for (String str = ""; ; str = "  " + ch.Z(localFile.length()))
    {
      localTextView.setText(str);
      return paramView;
    }
  }

  public final void wh(String paramString)
  {
    this.gvB = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.y
 * JD-Core Version:    0.6.2
 */