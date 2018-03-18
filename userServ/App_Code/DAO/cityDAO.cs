using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using App_Code;
using System.Data.Entity;

public class cityDAO : DbContext
{
    public virtual DbSet<city> city { get; set; }

    protected override void OnModelCreating(DbModelBuilder modelBuilder)
    {
        modelBuilder.Entity<city>()
            .Property(e => e.date)
            .IsUnicode(false);

        modelBuilder.Entity<city>()
                .Property(e => e.name)
                .IsUnicode(false);
    }
}