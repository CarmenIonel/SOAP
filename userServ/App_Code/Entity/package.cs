namespace App_Code
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("assignment4.package")]
    public partial class package
    {
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int id { get; set; }

        [Required]
        [StringLength(255)]
        public string description { get; set; }

        [Required]
        [StringLength(255)]
        public string name { get; set; }

        [Column(TypeName = "bit")]
        public bool tracking { get; set; }

        public int? destinationCity_id { get; set; }

        public int? receiver_id { get; set; }

        public int? sender_id { get; set; }

        public int? senderCity_id { get; set; }

        override
        public string ToString()
        {
            return "{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", senderCity=" + senderCity_id +
                ", destinationCity=" + destinationCity_id +
                ", tracking=" + tracking +
                ", sender=" + sender_id +
                ", receiver=" + receiver_id +
                '}';
        }
    }
}
