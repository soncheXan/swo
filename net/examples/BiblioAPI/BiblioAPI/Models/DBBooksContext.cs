using Microsoft.EntityFrameworkCore;

namespace BiblioAPI.Models
{
    public class DBBooksContext : DbContext
    {
        public DBBooksContext(DbContextOptions<DBBooksContext> options) : base(options)
        {

        }

        public DbSet<Book> Books { get; set;}
    }
}
