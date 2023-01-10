using DemoAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace DemoAPI.Config
{
    public class DBBookContex : DbContext
    {
        public DBBookContex(DbContextOptions<DBBookContex> options) : base(options)
        {

        }
        public DbSet<Book> books { get; set; }
    }
}
